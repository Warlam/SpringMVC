package org.springmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringConfig.class}; // путь до  конфига
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"}; // все запросы на диспетчер сервлет
    }
}
// заменяет web.xml