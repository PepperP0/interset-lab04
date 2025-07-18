
import java.util.ArrayList;

/* โปรแกรม เก็บเลข IntegerSet เรียงจากน้อยไปมาก
    ห้ามมี null หรือ ตัวเลขซ้ำ 
 */


public class IntegerSet {
    ArrayList<Integer>Number; //Rep
    //AF(Number) = ตัวเลขจำนวนเต็มทั้งหมดใน ArrayList<Integer>
    /*RI  1.ตัวเลขใน Integer ต้องเรียงลำดับจากน้อยไปมาก
          2.ตัวเลขใน Integer ห้ามมมีเลขซ้ำและ null
    */
    public IntegerSet(){
        Number = new ArrayList<>();
        CheckRep();
    }

    private void CheckRep(){
        if (Number==null) 
        throw new RuntimeException("Number is null");
        if (Number.size()>1) {
            for(int i = 0; i<Number.size()-1; i++){
                if (Number.get(i)>=Number.get(i+1)) {
                    throw new RuntimeException("error sort");
                }
            }
            
        }
              
    }
    /** 
     * เพิ่มตัวเลขเข้าไปใน เซต
     * 
     * 
     * @param x ตัวเลขที่ต้องการเพิ่ม
    */
    public void add(Integer x){
        if (!Number.contains(x) && Number != null && x != null) {
            if (Number.size() == 0) {
                Number.add(x);
            }else{
                if (x < Number.get(0)) { // เพิ่มด้านหน้า
                    Number.add(0,x);
                    
                }else {
                    for (int i = 0; i < Number.size(); i++) {
                        if (i==Number.size()-1) { // เพิ่มหลังสุด
                            Number.add(x);
                            break;
                        }
                        if (Number.get(i)< x && x <Number.get(i+1) ) { //add ตรงกลาง
                            Number.add(i+1,x);
                            break;
                            
                        }
                    }
                }
            }
            
        }
        CheckRep();
    }

    /*   
        ลบตัวเลขออกจากเซต
        *@param x ตัวเลขที่ต้องการลบ
     */
    public void remove(Integer x){
        if (Number.contains(x) && Number != null && x != null ) {
            Number.remove(x);
             
        }
       CheckRep();
    }

    /*
     * ตรวจสอบตัวเลขว่ามีในเซตไหม
     * @param x มีตัวเลขในเซตไหม
     */
    public boolean contains(Integer x){
        return Number.contains(x);
    }
    /*
     * คืนค่าขนาดของ เซต
     * @return จำนวนสมาชิกในเซต
     */
    public int size(){
        return Number.size();
    }
    public String toString(){
        return Number.toString();
    }

    
}