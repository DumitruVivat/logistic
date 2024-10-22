define(['component/listPage'],function(listPage) {
    return listPage(
        'markList',
        'resource->/api/car',
        [
            { id: "name", editor: "text"}
        ]
    )
})