/**
 * Created by daniel.baker on 3/1/2015.
 */
(function(){
    var app = angular.module("moneybags");
    var detailsController = function($scope, details) {
        $scope.userIdSeq = window.sessionStorage.userIdSeq;
        $scope.userName = window.sessionStorage.userName;

        var getDebtsSuccess = function(data) {
            $scope.userDebts = data;
        };
        var getDebtsError = function(data) {
            $scope.Message = "Getting debts failed!";
        };
        details.getDebts(window.sessionStorage.userIdSeq).then(getDebtsSuccess,getDebtsError);
        $scope.userExpenses = details.getExpenses(window.sessionStorage.userIdSeq);

        var saveSuccess = function(data) {
            $scope.Message = "Save Success!";
        };

        $scope.saveDebt = function (description, payAmount, dueDate, rate, totalLeft) {
            var debtObj = {
                userIdSeq: window.sessionStorage.userIdSeq,
                description: description,
                payAmount: payAmount,
                dueDate: dueDate,
                rate: rate,
                totalLeft: totalLeft
            };
            details.saveDebt(debtObj).then(saveSuccess,saveError);
        };
        $scope.saveExpense = function () {

        }
    };
    app.controller('DetailsController', detailsController);
}());