/**
 * Created by daniel.baker on 3/1/2015.
 */
(function(){
    var details = function($http) {
        var getDebts = function(userId) {
            return $http.post("../getDebts", userId)
                .then(function(response) {
                    return response.data;
                });
        };
        var getExpenses = function(userId) {
            return $http.post("../getExpenses", userId)
                .then(function(response) {
                    return response.data;
                });
        };
        var saveDebt = function(debtObj) {
            return $http.post("../saveDebt", debtObj)
                .then(function(response) {
                    return response.data;
                });
        };
        var saveExpense = function(expenseObj) {
            return $http.post("../saveExpense", expenseObj)
                .then(function(response) {
                    return response.data;
                });
        };

        return {
            getDebts: getDebts,
            getExpenses: getExpenses,
            saveDebt: saveDebt,
            saveExpense: saveExpense
        };
    };
    var module = angular.module("moneybags");
    module.factory("details", details);
}());