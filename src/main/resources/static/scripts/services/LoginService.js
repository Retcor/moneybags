/**
 * Created by dan on 2/26/15.
 */
(function(){
    var login = function($http) {
        var createUser = function(userObj) {
            return $http.post("../create", userObj)
                .then(function(response) {
                    return response.data;
                });
        };
        var login = function(userObj) {
            return $http.get("../login", userObj)
                .then(function(response) {
                    return response.data;
                });
        };
        return {
            createUser: createUser,
            login: login
        };
    };
    var module = angular.module("moneybags");
    module.factory("login", login);
}());