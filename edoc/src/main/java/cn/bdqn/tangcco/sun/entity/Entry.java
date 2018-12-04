package cn.bdqn.tangcco.sun.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Entry {


    /*eidint(11) NOT NULL
    cidint(11) NOT NULL
    titlevarchar(200) NOT NULL
    summaryvarchar(200) NOT NULL摘要
    uploaduservarchar200) NOT NULL上传人
    datadatetime NOT NULL*/

   private Integer  eid;
    private Integer cid;
    private String title;
    private String summary;
    private String uploaduser;
    private String data;
}
