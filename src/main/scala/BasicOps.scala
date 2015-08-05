/**
 * Created by leorick on 2015/8/5.
 */
import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs._

object BasicOps {
  def main(args: Array[String]) {
    val p = new Path("hdfs:///user")
    val hdpconf = new org.apache.hadoop.conf.Configuration()
    val dfs = p.getFileSystem(hdpconf)
    (dfs.listStatus(p)).foreach(println _)
    var fs = (dfs.listStatus(p))(0)
    println(f"Name=${fs.getPath.getName} , Permission=${fs.getPermission.toString}, URI=${fs.getPath.toUri}")
  }
}
