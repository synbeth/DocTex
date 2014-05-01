/* ===========================================================
 * jquery-square_menu.js v1
 * ===========================================================
 * Copyright 2013 Pete Rojwongsuriya.
 * http://www.thepetedesign.com
 *
 * Recreate a full page animated menu like you see 
 * Square Website using jQuery and CSS3
 *
 * https://github.com/peachananr/square_menu
 *
 * ========================================================== */

!function($){
  
  var defaults = {
    flyDirection: "bottom",
    button: "Menu",
    animationStyle: "vertical",
    closeButton: "X"
	};
	
  
  $.fn.square_menu_login = function(options){
    var settings = $.extend({}, defaults, options),
        el = $(this);  
    
    $("body").addClass("fsm-body");
    
    el.addClass("sm-login-menu sm-login-"+settings.flyDirection+ " sm-login-" + settings.animationStyle);
    el.wrapInner("<div class='sm-login-wrapper'></div>");
    
    el.find("nav").addClass("sm-login-nav").wrapInner("<div class='nav-login-inner'></div>");
    
    $.fn.closeMenu = function() {
      
      $(".sm-login-menu").addClass("animated").removeClass("re-rotate");
      $(".sm-login-menu .sm-login-close").remove();
      $(".sm-login-menu .sm-login-nav:first-child .nav-login-inner").removeClass("animated flyInLeft");
      $(".sm-login-menu .sm-login-nav:nth-child(2) .nav-login-inner").removeClass("animated flyInRight");
      
      if ($("body").hasClass("sm-login-activate")) {
        $(".sm-login-menu").find(".sm-login-nav").removeClass("animated");
        $(".sm-login-menu").one("transitionend webkitTransitionEnd oTransitionEnd MSTransitionEnd", function(){
          $("body").removeClass("sm-login-activate").find(".sm-login-menu").removeClass("ff-hack");
        });
      }
    };
    
    $.fn.openMenu = function() {
      
      $(".sm-login-menu").addClass("animated").addClass("ff-hack");
      
      if (!$("body").hasClass("sm-login-activate")) {
        if ($(".sm-login-overlay").length < 1) $("<div class='sm-login-overlay'></div>").hide().prependTo("body");
        $(".sm-login-overlay").fadeIn("fast", function() {
          $("body").addClass("sm-login-activate");
          var fired = false;
          $("body").one("transitionend webkitTransitionEnd oTransitionEnd MSTransitionEnd", function(e){
            if ( ! fired ) {
                fired = true;
                $(".sm-login-menu .sm-login-nav").addClass("animated");
                $(".sm-login-menu .sm-login-nav").one("transitionend webkitTransitionEnd oTransitionEnd MSTransitionEnd", function(e){
                  if (e.originalEvent.propertyName == '-webkit-transform' || e.originalEvent.propertyName == 'transform' || e.originalEvent.propertyName == '-o-transform' || e.originalEvent.propertyName == '-moz-transform') {
                    $(".sm-login-menu").addClass("re-rotate");
                    if (settings.closeButton != false) {
                      el.prepend("<a href='#' class='sm-login-close'>" + settings.closeButton + "</a>");

                      $(".sm-login-close").click(function() {
                        el.closeMenu();
                        return false;
                      });
                    }

                    $(".sm-login-menu .sm-login-nav:first-child .nav-login-inner").addClass("animated flyInLeft");
                    $(".sm-login-menu .sm-login-nav:nth-child(2) .nav-login-inner").addClass("animated flyInRight");
                    $(".sm-login-overlay:not(.clicked)").addClass("clicked").click(function() {
                      el.closeMenu();
                    });
                  }
                });
            }
          });
        });
      } else {
        el.closeMenu();
      }
    };
    
    if (settings.button != false) {
      $("<a href='#' class='sm-login-button'>" + settings.button + "</a>").insertAfter(el);
    }
    
    
    $(".sm-login-button").click(function() {
      el.openMenu();
      return false;
    });
  };
}(window.jQuery);

