/**
 * Created by dan on 2/26/15.
 */
(function(){
    var app = angular.module("moneybags");
    var loginController = function($scope, $http, login, $location, $rootScope) {

        var loginSuccess = function(data) {
            if (data != "" && data.userIdSeq) {
                window.sessionStorage.userIdSeq = data.userIdSeq;
                window.sessionStorage.userName = data.userName;
                $location.path("/details");
            } else {
                toastr.info('No User Found.');
            }
        };

        var loginError = function(data) {
            toastr.error('Login Failed!', 'Error');
        };

        var createUserSuccess = function(data) {
            toastr.success('Save Successful!', 'Success');
        };

        var createUserError = function(data) {
            toastr.error('Save Error!', 'Error');
        };

        $scope.createUser = function(userName, password) {
            var userObj = {
                userName: userName,
                password: password
            };
            login.createUser(userObj).then(createUserSuccess, createUserError);
        };

        $scope.login = function(userName, password) {
            var userObj = {
                userName: userName,
                password: password
            };
            login.login(userObj).then(loginSuccess,loginError);
        };
        window.setTimeout(function() {
            $(".flash").fadeTo(500, 0).slideUp(500, function(){
                $(this).remove();
            });
        }, 5000);
    };
    app.controller('LoginController', loginController);
}());