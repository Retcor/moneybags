/**
 * Created by dan on 2/26/15.
 */
(function(){
    var app = angular.module("moneybags");
    var loginController = function($scope, $http, login) {
        $scope.createUser = function(username, password) {
            var userObj = {
                username: username,
                password: password
            };
            login.createUser(userObj);
        };
    };
    app.controller('LoginController', loginController);
}());