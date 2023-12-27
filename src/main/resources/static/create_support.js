$(document).ready(function () {
    function validateHoTen() {
        let hoTen = $("#hoTen").val();

        if (hoTen === "") {
            $("#hoTen").addClass("is-invalid")
            $("#errorHoTen").text("* Không được để trống!")
            return false;
        } 
        
        $("#hoTen").removeClass("is-invalid")
        $("#errorHoTen").text("")
        return true;
    }

    function validateEmail() {
        let email = $("#email").val();

        if (email === "") {
            $("#email").addClass("is-invalid")
            $("#errorEmail").text("* Không được để trống!")
            return false;
        } 

        $("#email").removeClass("is-invalid")
        $("#errorEmail").text("")
        return true;

    }
    
    function validateSDT() {
        let sdt = $("#soDienThoai").val();

        if (sdt === "") {
            $("#soDienThoai").addClass("is-invalid")
            $("#errorSoDienThoai").text("* Không được để trống!")
            return false;
        } 

        $("#soDienThoai").removeClass("is-invalid")
        $("#errorSoDienThoai").text("")
        return true;

    }
    
    function validateNoiDung() {
        let nd = $("#noiDung").val();

        if (nd === "") {
            $("#noiDung").addClass("is-invalid")
            $("#errorNoiDung").text("* Không được để trống!")
            return false;
        } 

        $("#noiDung").removeClass("is-invalid")
        $("#errorNoiDung").text("")
        return true;

    }
    
    

    $(document).on("submit", "#formSupport", function (event) {
        event.preventDefault();

        if (!validateHoTen() | !validateEmail() | !validateSDT() | !validateNoiDung()) {
            $("#errorNotFullData").text("* Dữ liệu nhập vào chưa đầy đủ!")
			
            return;
        }

		$("#errorNotFullData").text("")
        this.submit();
    });
})