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
        .when("/details", {
            templateUrl: "../views/details.html",
            controller: "DetailsController"
        })
        .otherwise({redirectTo: "/"});
});