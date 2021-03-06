layui.use(['form','layer','jquery'],function(){
    var form = layui.form,
        layer = parent.layer === undefined ? layui.layer : top.layer
        $ = layui.jquery;


    //登录按钮
    form.on("submit(login)",function(data){
        var self = this
        $(this).text("登录中...").attr("disabled","disabled").addClass("layui-disabled");

        $.ajax({
            url: '/admin/login',
            type: 'post',
            data: {userName: data.field.userName, userPassword: data.field.userPassword, verCode: data.field.verCode},
            dataType: 'json',
            success: function (res) {
                if (res.data != null) {
                    setTimeout(function (res) {
                        window.location.href = '/index';
                    }, 1000);
                } else if (res.message == "验证码错误") {
                    layer.alert("验证码错误")
                    $(self).text("登录").attr("disabled", false).removeClass("layui-disabled")
                }else {
                    layer.alert("用户名或密码错误")
                    $(self).text("登录").attr("disabled", false).removeClass("layui-disabled")

                }
            }
        })



        return false;
    })

    //表单输入效果
    $(".loginBody .input-item").click(function(e){
        e.stopPropagation();
        $(this).addClass("layui-input-focus").find(".layui-input").focus();
    })
    $(".loginBody .layui-form-item .layui-input").focus(function(){
        $(this).parent().addClass("layui-input-focus");
    })
    $(".loginBody .layui-form-item .layui-input").blur(function(){
        $(this).parent().removeClass("layui-input-focus");
        if($(this).val() != ''){
            $(this).parent().addClass("layui-input-active");
        }else{
            $(this).parent().removeClass("layui-input-active");
        }
    })
})
