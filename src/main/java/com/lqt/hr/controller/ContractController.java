package com.lqt.hr.controller;

import com.lqt.hr.common.utils.RespMessage;
import com.lqt.hr.model.Contract;
import com.lqt.hr.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("contract")
public class ContractController {

    @Autowired
    private IContractService contractService;

    @GetMapping("contracts")
    public RespMessage getList(){
        System.out.println("contract/contracts");
        List<Contract> contracts = contractService.getList();
        return RespMessage.success(contracts);
    }

    @GetMapping("insert")
    public RespMessage insert(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "idCard", required = false) String idCard,
                              @RequestParam(value = "jobContent", required = false) String jobContent,
                              @RequestParam(value = "jobAddress", required = false) String jobAddress,
                              @RequestParam(value = "timeSetting", required = false) String timeSetting,
                              @RequestParam(value = "protection", required = false) String protection,
                              @RequestParam(value = "reward", required = false) String reward,
                              @RequestParam(value = "insurance", required = false) String insurance,
                              @RequestParam(value = "welfare", required = false) String welfare,
                              @RequestParam(value = "change", required = false) String change,
                              @RequestParam(value = "breach", required = false) String breach,
                              @RequestParam(value = "company", required = false) String company,
                              @RequestParam(value = "cpAddress", required = false) String cpAddress,
                              @RequestParam(value = "time", required = false) String time,
                              @RequestParam(value = "state", required = false) String state){
        System.out.println("contract/insert");
        Contract contract = new Contract(null, name, idCard, jobContent, jobAddress, timeSetting, protection, reward, insurance,
                 welfare,  change,  breach,  company,  cpAddress,  time,  state);
        try {
            int id = contractService.insert(contract);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("id", id);
            return RespMessage.success(map);
        }catch (Exception e) {
            e.printStackTrace();
            return RespMessage.fail("error");
        }
    }

    @GetMapping("update")
    public RespMessage update(@RequestParam("id")Integer id,
                              @RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "idCard", required = false) String idCard,
                              @RequestParam(value = "jobContent", required = false) String jobContent,
                              @RequestParam(value = "jobAddress", required = false) String jobAddress,
                              @RequestParam(value = "timeSetting", required = false) String timeSetting,
                              @RequestParam(value = "protection", required = false) String protection,
                              @RequestParam(value = "reward", required = false) String reward,
                              @RequestParam(value = "insurance", required = false) String insurance,
                              @RequestParam(value = "welfare", required = false) String welfare,
                              @RequestParam(value = "change", required = false) String change,
                              @RequestParam(value = "breach", required = false) String breach,
                              @RequestParam(value = "company", required = false) String company,
                              @RequestParam(value = "cpAddress", required = false) String cpAddress,
                              @RequestParam(value = "time", required = false) String time,
                              @RequestParam(value = "state", required = false) String state){
        System.out.println("contract/update");
        Contract contract = new Contract(id, name, idCard, jobContent, jobAddress, timeSetting, protection, reward, insurance,
                welfare,  change,  breach,  company,  cpAddress,  time,  state);

        try {
            contractService.update(contract);
            return RespMessage.SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
            return RespMessage.fail("error");
        }
    }

    @GetMapping("delete")
    public RespMessage delete(@RequestParam("id")Integer id){
        System.out.println("contract/delete");
        try {
            contractService.delete(id);
            return RespMessage.SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
            return RespMessage.fail("error");
        }
    }

}
