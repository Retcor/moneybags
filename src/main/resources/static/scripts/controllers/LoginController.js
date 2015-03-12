/**
 * Created by dan on 2/26/15.
 */
(function(){
    var app = angular.module("moneybags");
    var loginController = function($scope, $http, login, $location, $rootScope) {
        var createSuccess = function(data) {
            $scope.SavedSuccessMessage = "Saved Successfully!";
        };

        var createError = function(data) {
            $scope.SaveErrorMessage = "Save Failed!";
        };

        var loginSuccess = function(data) {
            if (data != "") {
                $rootScope.user = data;
                $location.path("/details");
            } else {
                $scope.NoUserMessage = "No User found.";
            }
        };

        var loginError = function(data) {
            $scope.LoginError = "Login Failed! Check login information and try again.";
        };

        $scope.createUser = function(userName, password) {
            var userObj = {
                userName: userName,
                password: password
            };
            login.createUser(userObj).then(createSuccess,createError);
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