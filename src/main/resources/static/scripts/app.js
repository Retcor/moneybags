/**
 * Created by dan on 2/26/15.
 */
var app = angular.module("moneybags", ["ngRoute"]);
app.config(function($routeProvider){
    $routeProvider
        .when("/", {
            templateUrl: "../views/login.html",
            controller: "LoginController"
        })
        .when("/add", {
            templateUrl: "../views/addAddress.html",
            controller: "AddressController"
        })
        .when("/addressList", {
            templateUrl: "../views/addressList.html",
            controller: "AddressController"
        })
        .otherwise({redirectTo: "/"});
});