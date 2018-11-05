<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>

    <title>宠物商店</title>

</head>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css"
      integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style type="text/css">
    #addPage {
        display: none;
    }
</style>
<body>
<h1>宠物列表</h1>
<div style="text-align: right" id="div1">
    <input type="button" class="btn btn-default btn-lg active" value="新增" id="addBtn"/>
    <input type="button" class="btn btn-default btn-lg active" value="删除" id="delBtn"/>
</div>
<br/>

<div id="addPage">

    <h2 align="center">新增宠物信息</h2>

    <form id="addForm" name="addForm" method="post">

        <div class="form-group">
            <label>编号</label>
            <input type="number" name="pId" class="form-control" placeholder="pId">
        </div>
        <div class="form-group">
            <label>类别</label>
            <input type="number" name="cId" class="form-control" placeholder="cId">
        </div>
        <div class="form-group">
            <label>名字</label>
            <input type="text" name="name" class="form-control" placeholder="name">
        </div>
        <div class="form-group">
            <label>标签</label>
            <input type="number" name="tId" class="form-control" placeholder="tId">
        </div>
        <div class="form-group">
            <label>标签</label>
            <input type="text" name="status" class="form-control" placeholder="status">
        </div>
        <button type="submit" id="addBtn1" class="btn btn-primary">提交</button>
        <button type="button" id="cancelBtn" class="btn btn-primary">取消</button>


        <%-- 编号：<input name="pId" type="number"/><br/>
         类别：<input name="cId" type="number"/><br/>
         名字：<input name="name" type="text"/><br/>
         标签：<input name="tId" type="number"/><br/>
         状态：<input name="status" type="text"/><br/>
         <div align="center">
             <input id="addBtn1" type="submit" value="新增"/>
             <input id="cancelBtn" type="button" value="取消"/>
         </div>--%>
    </form>

</div>
<table id="petTab" class="table table-striped">
    <tr>
        <th>编号</th>
        <th>类别</th>
        <th>名字</th>
        <th>照片</th>
        <th>标签</th>
        <th>状态</th>
        <th><input id="allSelect" type="checkbox"/>删除</th>
    </tr>

    <c:forEach var="p" items="${petList}">
        <tr>
            <td>${p.pId}</td>
            <td>${p.cId}</td>
            <td>${p.name}</td>
            <td>暂无照片</td>
            <td>${p.tId}</td>
            <td>${p.status}</td>
            <td><input type="checkbox" name="delpId" class="check"/>删除</td>
        </tr>
    </c:forEach>
</table>

<script src="../js/jquery.js"></script>
<script>
    $(function () {

        //删除按钮的事件
        $("#delBtn").click(function () {
            //判断至少有一项
            var checkedNum = $("input[name='delpId']:checked").length;
            if (checkedNum == 0) {
                alert("请至少选择一项你要删除的内容！");
                return false;
            }
            if (confirm("确定删除所选项目?")) {
                var checkedList = new Array();
                $("input[name='delpId']:checked").each(function () {
                    checkedList.push($(this).val());
                });
            }

            $.ajax({
                type:"POST",
                url:"web/user/batchDeletes.action",
                data:{"delItems":checkedList.toString()},
                datatype:"jsp",
                success:function(data){
                    $("[name='delpId']:checkbox").attr("checked",false);
                    art.dialog.tips('删除成功!');
                    setTimeout("location.reload()",1000);//页面刷新
                },
                error:function(data){
                    art.dialog.tips('删除失败!');
                }
            });

        });

            // 全选事件
            $("#allSelect").click(function () {
                $(":checkbox[name='delpId']").prop("checked", $(this).prop("checked"));
            });

            //增加按钮事件
            $("#addBtn").click(function () {
                $("#addPage").slideDown(1000);
                $("#petTab").hide();
            })

            //取消按钮事件
            $("#cancelBtn").click(function () {
                $("#addPage").hide();
                $("#petTab").slideDown(1000);
            });

            //提交按钮事件
            $("#addBtn1").click(function () {
                console.info($("#addForm").serializeArray())
                $.ajax({
                    method: 'post',
                    url: '/pet/add',
                    dateType: 'json',
                    data: $('#addForm').serializeArray(),
                    sucess: function (data) {
                        console.info(data)
                    }
                });

                $("#addPage").hide();
                $("#petTab").slideDown(1000);
            });
        });
</script>
</body>
</html>
