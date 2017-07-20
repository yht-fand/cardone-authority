package top.cardone.controller.vx.authority

import top.cardone.authority.service.RoleService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import top.cardone.context.ApplicationContextHolder
import top.cardone.web.support.WebSupport

import javax.servlet.http.HttpServletRequest

/**
 * Created by yht
 */
@Controller("top.cardone.controller.vx.authority.RoleController")
@RequestMapping("/vx/authority/role")
class RoleController {
    /**
     * /c0001.json begin
     **xx/
    @RequestMapping("/c0001.json")
    @ResponseBody
    Object c0001Json(HttpServletRequest request) {
        ApplicationContextHolder.getBean(WebSupport.class).func(request, { input -> ApplicationContextHolder.getBean(RoleService.class).insertByNotExistsCache(input) })
    }
    /** /c0001.json end **/
}