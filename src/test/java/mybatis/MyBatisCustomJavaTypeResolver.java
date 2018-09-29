package mybatis;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

import java.sql.Types;

/**
 * @author huy
 * @date 2018/9/29 15:18
 * @description 最小数字类型使用Integer类型
 */
public class MyBatisCustomJavaTypeResolver extends JavaTypeResolverDefaultImpl {
    public MyBatisCustomJavaTypeResolver() {
        super();
        //把数据库的 TINYINT, SMALLINT 映射成 Integer
        super.typeMap.put(Types.TINYINT, new JdbcTypeInformation("TINYINT", new FullyQualifiedJavaType(Integer.class.getName())));
        this.typeMap.put(Types.SMALLINT, new JdbcTypeInformation("SMALLINT", new FullyQualifiedJavaType(Integer.class.getName())));
    }

    @Override
    protected FullyQualifiedJavaType calculateBigDecimalReplacement(IntrospectedColumn column, FullyQualifiedJavaType defaultType) {
        FullyQualifiedJavaType answer;
        if (column.getScale() <= 0 && column.getLength() <= 18 && !this.forceBigDecimals) {
            if (column.getLength() > 9) {
                answer = new FullyQualifiedJavaType(Long.class.getName());
            } else if (column.getLength() > 4) {
                answer = new FullyQualifiedJavaType(Integer.class.getName());
            } else {
                answer = new FullyQualifiedJavaType(Integer.class.getName());
            }
        } else {
            answer = defaultType;
        }

        return answer;
    }
}
