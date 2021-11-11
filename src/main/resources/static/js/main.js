
new Vue({
    el: '#app',
    data(){
        return {
            isActive: true,
            carousels: [
                { text: 'Slide 1', image: 'https://picsum.photos/id/0/1230/500' },
                { text: 'Slide 2', color: 'info' },
                { text: 'Slide 3', color: 'success' },
                { text: 'Slide 4', color: 'warning' },
                { text: 'Slide 5', color: 'danger' }
            ]
        }
    }
})
