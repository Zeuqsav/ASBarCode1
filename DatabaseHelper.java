package com.example.waldo.myapplication;

/**
 * Created by Waldo on 28/01/2016.
 */



    import android.content.Context;
    import android.database.sqlite.SQLiteDatabase;
    import android.database.sqlite.SQLiteOpenHelper;

    public class DatabaseHelper extends SQLiteOpenHelper {
        private static final String DATABASE_NAME = "DEMO3.db";

        public DatabaseHelper(Context context) {
            super(context, DATABASE_NAME, null, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("DROP TABLE IF EXISTS usuarios");
            db.execSQL("DROP TABLE IF EXISTS actividades");
            db.execSQL("CREATE TABLE usuarios (_id INTEGER PRIMARY KEY AUTOINCREMENT,usuario TEXT, contrasena TEXT,rol TEXT);");
            db.execSQL("CREATE TABLE actividades (_id INTEGER PRIMARY KEY AUTOINCREMENT,actividad TEXT, idactividad TEXT, tarea TEXT, idtarea TEXT, comportamiento TEXT, idcomportamiento TEXT, respuestaesperada TEXT, respuesta TEXT, fechainicio TEXT,usuasignado TEXT);");
            db.execSQL("INSERT INTO usuarios (usuario, contrasena, rol) VALUES ('wvp','1234','ADM')");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','aceptación de tarea','1','responda si o no','1','si','comencemos','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','aceptación de tarea','1','responda si o no','2','no','pasamos a la siguiente tarea','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','Busque ítems de aseo','2','diga listo para pasar a la siguiente tarea','1','listo','pasamos a la siguiente tarea','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','Busque ítems de aseo','2','diga listo para pasar a la siguiente tarea','2','ayuda','tiene los siguientes comandos de voz, herramienta, peligro, ayuda y donde','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','Busque ítems de aseo','2','diga listo para pasar a la siguiente tarea','3','herramienta','use sus manos para acceder al lugar','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','Busque ítems de aseo','2','diga listo para pasar a la siguiente tarea','4','peligro','peligro de resbalar, esta húmedo','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','Busque ítems de aseo','2','diga listo para pasar a la siguiente tarea','5','Llamar','llamando a su jefe','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','Busque ítems de aseo','2','diga listo para pasar a la siguiente tarea','6','donde','encontrará lo ítems en el mueble de aseo','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','Consiga Agua','3','diga listo para pasar a la siguiente tarea','1','listo','pasamos a la siguiente tarea','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','Consiga Agua','3','diga listo para pasar a la siguiente tarea','2','ayuda','tiene los siguientes comandos de voz, herramienta, peligro, ayuda y donde','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','Consiga Agua','3','diga listo para pasar a la siguiente tarea','3','herramienta','use sus manos para acceder al lugar del agua','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','Consiga Agua','3','diga listo para pasar a la siguiente tarea','4','peligro','peligro de caída ','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','Consiga Agua','3','diga listo para pasar a la siguiente tarea','5','Llamar','llamando a su jefe','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','Consiga Agua','3','diga listo para pasar a la siguiente tarea','6','donde','encontrará el agua en la llave','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','Diríjase al lugar a limpiar','4','diga listo para pasar a la siguiente tarea','1','listo','pasamos a la siguiente tarea','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','Diríjase al lugar a limpiar','4','diga listo para pasar a la siguiente tarea','2','ayuda','tiene los siguientes comandos de voz, herramienta, peligro, ayuda y donde','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','Diríjase al lugar a limpiar','4','diga listo para pasar a la siguiente tarea','3','herramienta','use las escaleras','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','Diríjase al lugar a limpiar','4','diga listo para pasar a la siguiente tarea','4','peligro','peligro de electricidad en las escaleras','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','Diríjase al lugar a limpiar','4','diga listo para pasar a la siguiente tarea','5','Llamar','llamando a su jefe','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','Diríjase al lugar a limpiar','4','diga listo para pasar a la siguiente tarea','6','donde','limpie el 4to piso','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','limpie el 4to piso','5','diga listo para pasar a la siguiente tarea','1','listo','pasamos a la siguiente tarea','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','limpie el 4to piso','5','diga listo para pasar a la siguiente tarea','2','ayuda','tiene los siguientes comandos de voz, herramienta, peligro, ayuda y donde','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','limpie el 4to piso','5','diga listo para pasar a la siguiente tarea','3','herramienta','use sus manos para acceder al lugar','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','limpie el 4to piso','5','diga listo para pasar a la siguiente tarea','4','peligro','peligro de resbalar, esta húmedo','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','limpie el 4to piso','5','diga listo para pasar a la siguiente tarea','5','Llamar','llamando a su jefe','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','limpie el 4to piso','5','diga listo para pasar a la siguiente tarea','6','donde','encontrará lo ítems en el mueble de aseo','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','ordene todo','5','diga listo para pasar a la siguiente tarea','1','listo','Fin de la actividad','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','ordene todo','5','diga listo para pasar a la siguiente tarea','2','ayuda','tiene los siguientes comandos de voz, herramienta, peligro, ayuda y donde','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','ordene todo','5','diga listo para pasar a la siguiente tarea','3','herramienta','use sus manos para acceder al lugar','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','ordene todo','5','diga listo para pasar a la siguiente tarea','4','peligro','peligro de resbalar, esta húmedo','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','ordene todo','5','diga listo para pasar a la siguiente tarea','5','Llamar','llamando a su jefe','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de 4to piso','1','ordene todo','5','diga listo para pasar a la siguiente tarea','6','donde','encontrará lo ítems en el mueble de aseo','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de auto','2','aceptación de tarea','1','realizar actividad de lavado de auto responda si o no','1','si','comencemos','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de auto','2','aceptación de tarea','1','realizar actividad de lavado de auto responda si o no','2','no','pasamos a la siguiente tarea','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de auto','2','Busque ítems de aseo','2','diga listo para pasar a la siguiente tarea','1','listo','pasamos a la siguiente tarea','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de auto','2','Busque ítems de aseo','2','diga listo para pasar a la siguiente tarea','2','ayuda','tiene los siguientes comandos de voz, herramienta, peligro, ayuda y donde','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de auto','2','Busque ítems de aseo','2','diga listo para pasar a la siguiente tarea','3','herramienta','use sus manos para acceder al lugar','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de auto','2','Busque ítems de aseo','2','diga listo para pasar a la siguiente tarea','4','peligro','peligro de resbalar, esta húmedo','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de auto','2','Busque ítems de aseo','2','diga listo para pasar a la siguiente tarea','5','Llamar','llamando a su jefe','','wvp') ");
            db.execSQL("insert into actividades (actividad,idactividad,tarea,idtarea,comportamiento,idcomportamiento,respuestaesperada,respuesta,fechainicio,usuasignado) values ('realizar actividad de lavado de auto','2','Busque ítems de aseo','2','diga listo para pasar a la siguiente tarea','6','donde','encontrará lo ítems en el mueble de aseo','','wvp') ");

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            android.util.Log.w("books",
                    "Upgrading  de database, elimina la antigua");
            db.execSQL("DROP TABLE IF EXISTS usuarios");
            db.execSQL("DROP TABLE IF EXISTS actividades");
            onCreate(db);
        }
    }


