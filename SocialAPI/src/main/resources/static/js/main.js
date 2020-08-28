$('.first-col1').hover(
    function () {
        $(this).stop().animate({left: '68px'}, 200);
    },
    function () {
        $(this).stop().animate({left: '0'}, 200);
    });

$('.last-col1').hover(
    function () {
        $(this).stop().animate({right: '68px'}, 200);
    },
    function () {
        $(this).stop().animate({right: '0'}, 200);
    });