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
            // .get('https://api.coindesk.com/v1/bpi/currentprice.json')
            .get('http://0.0.0.0:8080/admin/projects/all')
            .then(response => (this.info = response.data));
    }
})
