package sawapp;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SawData {

	private List<Integer> sawTypes = new ArrayList<Integer>();
	private List<String> sawNames = new ArrayList<String>();
	private List<Integer> clothTypes = new ArrayList<Integer>();
	private List<String[]> sawMaterials = new ArrayList<String[]>();
	private List<Integer[]> sawMaterialsNumbers = new ArrayList<Integer[]>();
	private List<Integer[]> sawLifePoints = new  ArrayList<Integer[]>();
	private BufferedReader br;

	SawData(String filePath){
		try {
			String line;
			br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath),"UTF-8"));
			while((line = br.readLine()) != null){
				String[] lineArray = line.split(",");
				setSawTypes(Integer.parseInt(lineArray[0]));
				setSawNames(lineArray[1]);
				setClothTypes(Integer.parseInt(lineArray[2]));
				String[] materialsArray = new String[5];
				for(int i=0;i<5;i++){
					materialsArray[i] = lineArray[3+i];
				}
				setSawMaterials(materialsArray);
				Integer[] materialsNumberArray = new Integer[5];
				for(int i=0;i<5;i++){
					materialsNumberArray[i] = Integer.parseInt(lineArray[8+i]);
				}
				setSawMaterialsNumbers(materialsNumberArray);
				Integer[] LifePointsArray = new Integer[9];
				for(int i=0;i<9;i++){
					LifePointsArray[i] = Integer.parseInt(lineArray[13+i]);
				}
				setSawLifePoints(LifePointsArray);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (NumberFormatException e){
			e.printStackTrace();
		}

	}

	private void setSawTypes(int sawTypes){
		this.sawTypes.add(sawTypes);
	}
	public int searchSawTypesFirstNumber(int i){
		return (sawTypes.indexOf(i));
	}
	public int searchSawTypesLastNumber(int i){
		return (sawTypes.lastIndexOf(i));
	}
	private int getSawTypes(int i){
		try{
			return sawTypes.get(i);
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			return 0;
		}
	}
	
	private void setSawNames(String sawNames){
		this.sawNames.add(sawNames);
	}
	public String getSawNames(int i){
		try{
			return sawNames.get(i);
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			return "";
		}
	}
	private void setClothTypes(int clothTypes){
		this.clothTypes.add(clothTypes);
	}
	public int getClothTypes(int i){
		try{
			return clothTypes.get(i);
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			return 0;
		}
	}
	private void setSawMaterials(String[] sawMaterials){
		this.sawMaterials.add(sawMaterials.clone());
	}
	private String[] getSawMaterials(int i){
		try{
			return (String[])sawMaterials.get(i);
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			return null;
		}
	}
	private void setSawMaterialsNumbers(Integer[] sawMaterialsNumbers){
		this.sawMaterialsNumbers.add(sawMaterialsNumbers.clone());
	}
	private Integer[] getSawMaterialsNumbers(int i){
		try{
			return sawMaterialsNumbers.get(i);
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			return new Integer[0];
		}
	}
	private void setSawLifePoints(Integer[] sawLifePoints){
		this.sawLifePoints.add(sawLifePoints.clone());
	}
	public Integer[] getSawLifePoints(int i){
		try{
			return sawLifePoints.get(i);
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			return new Integer[0];
		}
	}
}
