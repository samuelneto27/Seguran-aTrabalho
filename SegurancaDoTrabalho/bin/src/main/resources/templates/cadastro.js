var app = angular.module('myApp', ['ngFileUpload']);

app.controller('myController', function ($scope, $window) {
	$scope.setorBody = [];
	$scope.setores = [];

	// Pega valor do do arquivo csv
	$scope.SelectFile = function (file) {
		$scope.SelectedFile = file;
	};

	//Valida se arquivo é do tipo CSV 
	$scope.Upload = function (funcionarioOuSetor) {
		var regex = /^([a-zA-Z0-9\s_\\.\-:])+(.csv|.txt)$/;
		if (regex.test($scope.SelectedFile.name.toLowerCase())) {
			if (typeof (FileReader) != "undefined") {
				var reader = new FileReader();
				reader.onload = function (e) {
					var customers = new Array();
					$scope.rows = e.target.result.split("\r\n");

					//Verifica se upload é tipo funcionario
					if(funcionarioOuSetor === "funcionario")
						$scope.funcionarios = converterCsv($scope.rows);

					//Verifica se upload é tipo setor
					if(funcionarioOuSetor === "setor"){
						var setorAux = converterCsv($scope.rows);
						for(var i = 0; i < setorAux.length;i++){
							
							$scope.setores.push(setorAux[i]);
						}
					}
				}
				reader.readAsText($scope.SelectedFile);
			} else {
				$window.alert("Valor do arquivo não encontrado");
			}
		} else {
			$window.alert("Por favor, faça o upload de um arquivo CSV válido");
		}
	}

	// converte o arquivo CSV em um Array
	function converterCsv($scope){

		if($scope === null || isFinite($scope)) return;
		
		var headers= $scope[0].split(";");
		var result = [];
		for(var i=1;i<$scope.length;i++){

			var obj = {};
			var currentline=$scope[i].split(";");

			for(var j=0;j<headers.length;j++){
				obj[headers[j]] = currentline[j];
			}

			result.push(obj);

		}
		return result;
	}

	//Converte CSV (Funcionario)  em JSON 
	$scope.funcionarioJson = function(){
		$scope.funcionarioBody = angular.toJson($scope.funcionarios);

	};

	//Converte CSV (Setor)  em JSON 
	$scope.setorJson = function(){
		if($scope.setorBody === null || $scope.setorBody === undefined)
			$scope.setorBody = angular.toJson($scope.setores);
		else
			$scope.setorBody.push(angular.toJson($scope.setores));
	};

	//Adiciona setor a lista de setores
	$scope.addSetor = function(setor){
		var novo = {};
		novo.nome = setor.nome;
		novo.id = setor.id;
		novo.cpf = setor.cpf;
		$scope.setores.push(angular.copy(novo));

	}

});