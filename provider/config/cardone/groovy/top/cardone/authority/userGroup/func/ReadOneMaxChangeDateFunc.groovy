package top.cardone.authority.userGroup.func

import top.cardone.core.util.func.Func3
import top.cardone.data.dao.PageDao

class ReadOneMaxChangeDateFunc implements Func3<Date, Class<?>, PageDao, Map<String, Object>> {
    @Override
    Date func(Class<?> requiredType, PageDao pageDao, Map<String, Object> readOne) {
        pageDao.readOneBySqlFileName(requiredType, "readOneMaxChangeDate", readOne)
    }
}