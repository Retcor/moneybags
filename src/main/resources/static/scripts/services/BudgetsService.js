/**
 * Created by daniel.baker on 3/1/2015.
 */
(function(){
    var budgets = function($http) {
        var getBudgets = function(userIdSeq) {
            return $http.post("../getBudgets", userIdSeq)
                .then(function(response) {
                    return response.data;
                });
        };
        var saveBudget = function(budget) {
            return $http.post("../saveBudget", budget)
                .then(function(response) {
                    return response.data;
                });
        };

        return {
            getBudgets: getBudgets,
            saveBudget: saveBudget
        };
    };
    var module = angular.module("moneybags");
    module.factory("budgets", budgets);
}());