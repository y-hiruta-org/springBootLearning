/**
 *
 */

$(function(){
	$.fn.submitForms = function(idName){
        var form = $(this).parents('form');
        form.attr('action', $(this).data('action'));
//        var hoge = $(this).data('hoge');
//            $('<input>').attr({
//                'type': 'hidden',
//                'name': 'hoge',
//                'value': hoge
//            }).appendTo(form);
        form.attr("method", $(this).data('method'));
        console.log('処理が実行されました。');
        form.submit();
    }
})