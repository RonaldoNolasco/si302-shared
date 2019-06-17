var app = new Vue({
    el: '#app',
    data: {
        titulo: 'Registro de Usuario',
        susti: 'Nos vemos en el SuStI.',
        pagina: 1
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