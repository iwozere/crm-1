# CRM Frontend Module

## Overview

The `crm-frontend` module provides a web UI interface for the CRM system, offering web pages and forms that delegate to UI task implementations. This module serves as the web presentation layer for CRM operations.

## Architecture

### Web MVC Controller Pattern

The module implements Spring MVC controllers that provide web pages and handle form submissions:

- **Thymeleaf Templates**: Server-side rendered HTML pages
- **REST-like Endpoints**: Web endpoints that return HTML pages instead of JSON
- **Task Delegation**: Controllers delegate business logic to the `UITaskAggregator`

### CrmFrontendController

The main controller (`CrmFrontendController`) provides:

- **Page Endpoints**: Return HTML pages with data from UI tasks
- **Form Handling**: Process form submissions and redirect appropriately
- **Error Handling**: Display user-friendly error pages

## Current Controller Endpoints

### Customer Dashboard
- **URL**: `GET /ui/customer/{customerId}/dashboard`
- **Purpose**: Display customer dashboard with recent activity and statistics
- **Template**: `customer-dashboard.html`
- **Data Source**: `getCustomerDashboard` UI task

### Home Page
- **URL**: `GET /ui/`
- **Purpose**: Main landing page for the CRM web interface
- **Template**: `home.html`

## Dependencies

- `crm-common`: Shared transport layer components
- `crm-ui-tasks`: UI task implementations
- `spring-boot-starter-web`: Web server and MVC support
- `spring-boot-starter-thymeleaf`: Template engine for HTML rendering

## Configuration

The module runs as a standalone Spring Boot application on port 8084 (configured in `application.yaml`).

## Template Structure

Templates are located in `src/main/resources/templates/`:

```
templates/
├── home.html              # Home page
├── customer-dashboard.html # Customer dashboard
├── error.html            # Error page
└── fragments/            # Reusable template fragments
```

## API Usage Examples

### Access Customer Dashboard
```bash
GET /ui/customer/123/dashboard
```

Returns an HTML page displaying:
- Customer information
- Recent orders count
- Active orders count
- Total amount spent
- Last login date

## Development

### Adding New UI Pages

1. **Create UI Task** in `crm-ui-tasks`:
```java
@Component
public class MyPageDataTask extends UITaskBase {
    @Override
    public String getTaskType() {
        return "myPageData";
    }
    // ... implementation
}
```

2. **Add Controller Method**:
```java
@GetMapping("/my-page/{param}")
public String myPage(@PathVariable String param, Model model) {
    Map<String, Object> data = taskAggregator.executeTask("myPageData",
        Map.of("param", param));
    model.addAllAttributes(data);
    return "my-page";
}
```

3. **Create Thymeleaf Template**:
```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head><title>My Page</title></head>
<body>
    <h1 th:text="${title}">Title</h1>
    <div th:each="item : ${items}">
        <p th:text="${item.name}">Item</p>
    </div>
</body>
</html>
```

### Running the Application

```bash
cd crm-frontend
mvn spring-boot:run
```

The web UI will be available at `http://localhost:8084/ui/`

## Error Handling

The controller provides user-friendly error handling:

- **Invalid Parameters**: Redirect to error page with user-friendly message
- **Task Failures**: Display error page with actionable information
- **Missing Data**: Graceful handling of missing or incomplete data

## Testing

The module includes:

- **Integration Tests**: Test controller endpoints with mocked tasks
- **Template Tests**: Verify template rendering with test data
- **End-to-End Tests**: Full request/response testing

## Security Considerations

Future enhancements may include:

- **Authentication**: User login and session management
- **Authorization**: Role-based access control
- **CSRF Protection**: Cross-site request forgery prevention
- **Input Validation**: Client and server-side validation

## Future Enhancements

- **Single Page Application**: Migrate to SPA with REST API backend
- **WebSocket Support**: Real-time updates for dashboard data
- **Internationalization**: Multi-language support
- **Responsive Design**: Mobile-friendly UI components</content>
<parameter name="filePath">c:\dev\learn\crm\crm-frontend\docs\project-specification.md