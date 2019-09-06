/**
 * phantomJs 脚本
 */
var page = require('webpage').create(), system = require('system'), address, output, size;

if (system.args.length < 3 || system.args.length > 5) {
    phantom.exit(1);
} else {
    address = system.args[1];
    output = system.args[2];
    //定义宽高
    page.viewportSize = {
        width: 800,
        height: 600
    };
    page.open(address, function (status) {
        var bb = page.evaluate(function () {
            return document.getElementsByTagName('html')[0].getBoundingClientRect();
        });
        page.clipRect = {
            top: bb.top,
            left: bb.left,
            width: bb.width,
            height: bb.height
        };
        window.setTimeout(function () {
            page.render(output);
            page.close();
            console.log('渲染成功...');
        }, 1000);
    });
}