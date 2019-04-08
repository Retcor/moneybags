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
        .when("/budgets", {
            templateUrl: "../views/budgets.html",
            controller: "BudgetsController"
        })
        .when("/details", {
            templateUrl: "../views/details.html",
            controller: "DetailsController"
        })
        .otherwise({redirectTo: "/"});
});