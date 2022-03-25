package dao;

public class DaoFactory {
	    
	    public static AlunoDao getAlunoDao(){
	        return new AlunoDao();
	    }
	    
	    public static CursoDao getCursoDao() {
	    	return new CursoDao();
	    }
	    
	    public static TurmaDao getTurmaDao() {
	    	return new TurmaDao();
	    }

		public static MatriculaDao getMatriculaDao() {
			return new MatriculaDao();
			
		}
	    
	    

}
