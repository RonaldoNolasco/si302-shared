var app = new Vue({
    el: '#app',
    data: {
        titulo: 'Registro de Usuario',
        pagina: 1,
        busqueda:{
            coGenero:null ,titulo:null
        },
        listaLibro:null
    },
    methods:{
        buscar:function(){
            fetch('buscar-libro', {
                method: 'POST',
                body: JSON.stringify(this.busqueda),
                headers:{
                    'Content-Type': 'application/json'
                }
            }).then(function(res){ return res.json(); })
                .then(function(data){
                    this.listaLibro = data.libros;
                });
        }
    }
});