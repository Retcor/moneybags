/**
 * Created by dan on 2/26/15.
 */
(function(){
    var login = function($http) {
        var createUser = function(userObj) {
            $http.post("../create", userObj)
                .then(function() {
                    console.log("Saved User Successfully!");
                });
        };
        var getUser = function() {
            return $http.get("../login")
                .then(function(response) {
                    return response.data;
                });
        };
        return {
            createUser: createUser,
            getUser: getUser
        };
    };
    var module = angular.module("moneybags");
    module.factory("login", login);
}());