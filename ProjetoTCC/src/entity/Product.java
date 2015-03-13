/**
 * 
 */
package entity;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Maciel B
 *
 */
@Entity
@Table(name = "products")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int product_id;
	@Column(name="name")
	private String name;
	@Column(name = "project")
	private String project;
	@ElementCollection
	@CollectionTable(name="labels")
	//esta lista de labels é utilizada para armazenar os modelos do cell
	//exemplo: moto g, moto x...
	private List<String> labels;

	public int getId() {
		return product_id;
	}

	public void setId(int id) {
		this.product_id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public List<String> getLabels() {
		return labels;
	}

	public void setLabels(List<String> labels) {
		this.labels = labels;
	}
	
	public String[] getLabelIsAsArray(){
		//pegando o tamanho total da lista
		int size = labels.size();
		//o vector auxiliar terá tamanho da lista
		String[] result = new String[size];
		//varendo a lista de labels e adicionando no vector aux.
		for(int i=0;i<size;i++){
			result[i]= labels.get(i);
		}
		return result;
	}
}
