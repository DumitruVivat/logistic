define(function () {
    return {
        rows:[
            {
                view: 'button',
                label: 'Main',
                click: function () {
                    routie('')
                }
            },
            {
                view: 'list',
                data: [
                    'audi q7',
                    'mbx x7',
                    'uaz patriot'
                ]
            }
        ]
    }
})