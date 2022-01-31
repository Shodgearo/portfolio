new Vue({
    el: '#app',
    data() {
        return {
            isCustom: false,
            info: []
        }
    },
    mounted() {
        axios
            .get('http://0.0.0.0:8080/admin/projects/all')
            .then(response => (this.info = response.data));
    }
})
