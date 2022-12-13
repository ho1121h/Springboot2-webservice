// 기능 추가하기 위함// 플루터랑 비슷하구만 // 글등록 시 버튼 구현
var main = {
    init : function () {
        var _this = this;
        $('#btn-save').on('click', function () {
            _this.save();
        });

        $('#btn-update').on('click', function () { //btn-update 해당이벤트 발생 시 다음 함수를 실행
                    _this.update();
                });

        $('#btn-delete').on('click', function () {
                    _this.delete();
                });
    },
    save : function () {
            var data = {
                title: $('#title').val(),
                author: $('#author').val(),
                content: $('#content').val()
            };
            $.ajax({
                    type: 'POST',
                    url: '/api/v1/posts',
                    dataType: 'json',
                    contentType:'application/json; charset=utf-8',
                    data: JSON.stringify(data)
            }).done(function() {
                alert('글이 등록되었습니다.');
                window.location.href = '/'; //글등록이 성공하면 메인페이지로 이동함
            }).fail(function (error) {
                        alert(JSON.stringify(error));
                });
        },
    update : function () { // 새 함수
            var data = {
                title: $('#title').val(),
                content: $('#content').val()
            };

            var id = $('#id').val();

            $.ajax({
                type: 'PUT', //CRUD 의 PUT 메소드
                url: '/api/v1/posts/'+id,
                dataType: 'json',
                contentType:'application/json; charset=utf-8',
                data: JSON.stringify(data)
            }).done(function() {
                alert('글이 수정되었습니다.');
                window.location.href = '/';
            }).fail(function (error) {
                alert(JSON.stringify(error));
            });
        },
    delete : function () {
            var id = $('#id').val();

            $.ajax({
                type: 'DELETE',
                url: '/api/v1/posts/'+id,
                dataType: 'json',
                contentType:'application/json; charset=utf-8'
            }).done(function() {
                alert('글이 삭제되었습니다.');
                window.location.href = '/';
            }).fail(function (error) {
                alert(JSON.stringify(error));
            });
        }
};

main.init();