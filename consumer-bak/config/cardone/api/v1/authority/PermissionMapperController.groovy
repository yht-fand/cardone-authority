package top.cardone.api.vx.authority

import top.cardone.authority.service.PermissionMapperService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import top.cardone.context.ApplicationContextHolder
import top.cardone.web.support.WebSupport

import javax.servlet.http.HttpServletRequest

/**
 * Created by yht
 */
@Controller
@RequestMapping("/v1/authority/permissionMapper")
class PermissionMapperController {
    /**
     * /c0001.json begin
     **xx/
    @RequestMapping("/c0001.json")
    @ResponseBody
    Object c0001Json(HttpServletRequest request) {
        ApplicationContextHolder.getBean(WebSupport.class).func(request, { input -> ApplicationContextHolder.getBean(PermissionMapperService.class).insertByNotExistsCache(input) })
    }
    /** /c0001.json end **/
}