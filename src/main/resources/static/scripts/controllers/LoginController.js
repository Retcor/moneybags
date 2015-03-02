/**
 * Created by dan on 2/26/15.
 */
(function(){
    var app = angular.module("moneybags");
    var loginController = function($scope, $http, login) {
        var success = function(data) {
            $scope.Success = "Saved Successfully!";
        };

        var error = function(data) {
            $scope.Success = "Save Failed!";
        };

        $scope.createUser = function(userName, password) {
            var userObj = {
                userName: userName,
                password: password
            };
            login.createUser(userObj).then(success,error);
        };
    };
    app.controller('LoginController', loginController);
}());