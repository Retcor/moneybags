/**
 * Created by dan on 2/26/15.
 */
(function(){
    var app = angular.module("moneybags");
    var loginController = function($scope, $http, login, $location, $rootScope) {
        var createSuccess = function(data) {
            $scope.Message = "Saved Successfully!";
        };

        var createError = function(data) {
            $scope.Message = "Save Failed!";
        };

        var loginSuccess = function(data) {
            if (data != "") {
                $rootScope.user = data;
                $location.path("/details");
            } else {
                $scope.Message = "No User found.";
            }
        };

        var loginError = function(data) {
            $scope.Message = "Login Failed!";
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
        }
    };
    app.controller('LoginController', loginController);
}());