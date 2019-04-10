/**
 * Created by daniel.baker on 3/1/2015.
 */
(function(){
    var app = angular.module("moneybags");
    var budgetsController = function($scope, budgets, $location) {
        $scope.userIdSeq = window.sessionStorage.userIdSeq;
        $scope.userName = window.sessionStorage.userName;

        var getBudgetsSuccess = function(data) {
            $scope.userBudgets = data;
        };
        var getBudgetsError = function(data) {
            $scope.Message = "Getting budgets failed!";
        };
        budgets.getBudgets(window.sessionStorage.userIdSeq).then(getBudgetsSuccess,getBudgetsError);

        var saveSuccess = function(data) {
            $scope.Message = "Save Success!";
            $scope.userBudgets.push(data);
            $scope.descr = "";
        };

        var saveError = function(data) {
            $scope.Message = "Save Error!";
        };

        $scope.saveBudget = function (descr) {
            var budgetObj = {
                userIdSeq: window.sessionStorage.userIdSeq,
                descr: descr
            };
            budgets.saveBudget(budgetObj).then(saveSuccess,saveError);
        };

        $scope.logout = function () {
            window.sessionStorage.userIdSeq = null;
            window.sessionStorage.userName = null;
            $location.path("/");
        };
    };
    app.controller('BudgetsController', budgetsController);
}());