package cn.bdqn.tangcco.sun.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    /*cidint(11) NOT NULL
    cnamevarchar(200) NOT NULL*/

    private int cid;
    private String cname;

}
