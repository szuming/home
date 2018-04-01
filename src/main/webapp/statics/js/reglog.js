$().ready(function() {

    $("#login_form").validate({
        rules: {
            username: "required",
            password: {
                required: true,
                minlength: 5
            },

        },
        messages: {
            username: "请输入姓名",
            password: {
                required: "请输入密码",
                minlength: jQuery.format("密码不能小于{0}个字 符")
            },
        },
        //提交表单
        submitHandler:function(form) {
            form.submit();
        }
    });

    $("#reg_form").validate({
        rules: {
            username: "required",
            password: {
                required: true,
                minlength: 5
            },
            rpassword: {
                required:true,
                equalTo: "#register_password"
            }
        },
        messages: {
            username: "请输入姓名",
            password: {
                required: "请输入密码",
                minlength: jQuery.format("密码不能小于{0}个字 符")
            },
            rpassword: {
                required:"请再次输入密码",
                equalTo: "两次密码不一样"
            }
        },

        //提交表单
        submitHandler:function(form) {
            form.submit();
        }
    });
});

//实现登陆页面与注册页面的切换
$(function() {
    $("#register_btn").click(function() {
        $("#register-page").css("display", "block");
        $("#login-page").css("display", "none");
    });
    $("#back_btn").click(function() {
        $("#register-page").css("display", "none");
        $("#login-page").css("display", "block");
    });
});



