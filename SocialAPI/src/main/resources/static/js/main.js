$('.first-col1').hover(
    function () {
        $(this).stop().animate({left: '68px'}, 200);
    },
    function () {
        $(this).stop().animate({left: '0'}, 200);
    },
    stopAnimation);

$('.last-col1').hover(
    function () {
        $(this).stop().animate({right: '68px'}, 200);
    },
    function () {
        $(this).stop().animate({right: '0'}, 200);
    },
    stopAnimation);

function stopAnimation() {
    if ($(this).hover.length != 0) {
        $(this).stop();
    }
}