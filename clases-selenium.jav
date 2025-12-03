public class ClasesSelenium {
    public void abrirPagina(String url) {
        driver.get(url);
        System.out.println("Página abierta: " + url);
    }

    public void cerrarNavegador() {
        driver.quit();
        System.out.println("Navegador cerrado.");
    }

    public void hacerClick(String selector) {
        driver.findElement(By.xpath(selector)).click();
        System.out.println("Clic realizado en el elemento con selector: " + selector);
    }

    public void escribirTexto(String selector, String texto) {
        driver.findElement(By.xpath(selector)).sendKeys(texto);
        System.out.println("Texto escrito en el elemento con selector: " + selector);
    }
}