db.createUser(
    {
        user : "mihail",
        pwd : "miha5418",
        roles : [
            {
                role : "readWrite",
                db : "mongo-db-ru.fitnes"
            }
        ]
    }
)