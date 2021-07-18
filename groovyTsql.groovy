import groovy.sql.Sql

/**
 * @author huixuan* @since 15/7/21
 */

def sql = Sql.newInstance("jdbc:sqlserver://localhost:1433", "sa", "Wombat@007", "com.microsoft.sqlserver.jdbc.SQLServerDriver")

//sql.eachRow("select name from sys.Databases") {println "${it.name}"

sql.eachRow("SELECT * from testDB.product.inventory") {
    println "${it.id_vendor} | ${it.quantity_mouse} | ${it.quantity_screen}| ${it.quantity_keyboard} | ${it.quantity_webcam}"

}

sql.eachRow("SELECT * from testDB.product.vendor") {
    println "${it.id} | ${it.name_vendor} | ${it.domain_vendor} | ${it.email_vendor}"
}
