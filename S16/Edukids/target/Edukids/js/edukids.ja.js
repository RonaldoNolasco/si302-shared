var app = new Vue({
    el: '#app',
    data: {
        titulo: 'Registro de Usuario',
        pagina: 1,
        usuario : {
            codigo: null,
            nombre:null,
            credencial:null,
            correo:null
        },
        usuariof : {
            nombres: null,
            apellidos:null,
            nacimiento:null,
            genero:null,
            profesion:null
        }
    },
    methods:{
        limpiar : function () {
            var inputs = document.querySelectorAll('input.auth');

            for (var i = 0; i < inputs.length; i++) {
                inputs[i].value = ' ';
            }
        },
        mostrar: function(){
            this.pagina = 2;
        },
        setPagina : function (pagina) {
            this.pagina = pagina;
        },
        isPagina : function (pagina) {
            return (this.pagina == pagina);
        },
        registrarUsuario:function(){

            fetch('registro-usuario', {
                method: 'POST',
                body: JSON.stringify(this.usuario),
                headers:{
                    'Content-Type': 'application/json'
                }
            }).then(function(res){ return res.json(); })
            .then(function(data){
                this.usuario = data;
            });

        },
        registrarUsuariof:function(){

            fetch('registro-usuariof', {
                method: 'POST',
                body: JSON.stringify(this.usuariof),
                headers:{
                    'Content-Type': 'application/json'
                }
            }).then(function(res){ return res.json(); })
                .then(function(data){
                    this.usuariof = data;
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