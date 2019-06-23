var app = new Vue({
    el: '#app',
    data: {
        titulo: 'Registro de Usuario',
        susti: 'Nos vemos en el SuStI.',
        pagina: 1,
        pedido : {
            producto:{ idProducto:null, nombre:null, precioUnitario:null},
            idPedido:null,
            cantidadProductos:null,
            igv:null,
            montoTotal:null
        },
        listaPedido:null
    },
    methods:{
        limpiar : function () {
            var inputs = document.querySelectorAll('input.auth');

            for (var i = 0; i < inputs.length; i++) {
                inputs[i].value = '';
            }
            this.pagina = 2;

        },
        setPagina : function (pagina) {
            this.pagina = pagina;
        },
        isPagina : function (pagina) {
            return (this.pagina == pagina);
        },
        registrarPedido:function(){

            this.pedido={
                producto:{ idProducto:1, nombre:'p', precioUnitario:10.50},
                idPedido:1,
                cantidadProductos:10,
                igv:100.1,
                montoTotal:1000.2
            };
            fetch('agregar-pedido', {
                method: 'POST',
                body: JSON.stringify(this.pedido),
                headers:{
                    'Content-Type': 'application/json'
                }
            }).then(function(res){ return res.json(); })
            .then(function(data){
                this.listaPedido = data.pedidos;
            });
        }
    }
});




/*
window.addEventListener('load',function(){
   var t=document.querySelector('#limpiaBtn');
   t.addEventListener('click',function () {
       var inputs = document.querySelectorAll('input.auth');

       for (var i = 0; i < inputs.length; i++) {
           inputs[i].value = '';
       }

   });
});
*/
/*
var limpiar = function () {
    var nombre = document.querySelector('#nom');
    nombre.value = 'Bendezu';
};
*/