package com.mytiki.company_index.features.latest.company;

import com.mytiki.common.ApiConstants;
import com.mytiki.common.reply.ApiReplyAO;
import com.mytiki.common.reply.ApiReplyAOFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = CompanyController.PATH_CONTROLLER)
public class CompanyController {
    public static final String PATH_CONTROLLER = ApiConstants.API_LATEST_ROUTE + "company";

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ApiReplyAO<CompanyAO> getDomain(@RequestParam String domain){
        return ApiReplyAOFactory.ok(companyService.findByDomain(domain));
    }
}
