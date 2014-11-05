function mostraDetalhe(id){
    
    $.ajax({
        url: "/vraptor-tomcat/"+id+"/produto.json",
        type: 'GET',
        success: function (data) {
            console.log(data);
            var vId = $("#pID");
            var vNome = $("#pNOME");
            var vPreco = $("#pPRECO");
            
            vId.html(data.produto.id);
            vNome.html(data.produto.nome);
            vPreco.html(data.produto.preco);
            
            $("#overlay").css("visibility","visible");
        }
    });
  
};

$("#btn-fechar").on("click", function (){
    $("#overlay").css("visibility","hidden");
    
});
